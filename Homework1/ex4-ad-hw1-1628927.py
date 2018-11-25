class Machine:
    def __init__(self):
        self.jobs = []

    def addJob(self, job):
        self.jobs.append(job)


class Job:
    def __init__(self, index, processingTime):
        self.index = index
        self.processingTime = processingTime


class Scheduler:
    def __init__(self, jobs, machines):
        self.jobs = jobs
        self.machines = machines

    def schedule(self):
        t = 0
        T = 0
        tMax = 0
        machineCounter = 0
        singleMachine = 0
        for job in self.jobs:
            T += job.processingTime
            if(job.processingTime > tMax):
                tMax = job.processingTime

        t = T / len(self.machines)
        if(tMax >= t):
            t = tMax

        print("Cmax is:" + str(t))
        for job in self.jobs:
            if(job.processingTime > t - singleMachine):
                spaceOnThisMachine = t - singleMachine
                self.machines[machineCounter].addJob(Job(job.index,
                                                         spaceOnThisMachine))
                machineCounter += 1
                singleMachine = job.processingTime - spaceOnThisMachine
                self.machines[machineCounter].addJob(
                    Job(job.index, singleMachine))
            else:
                singleMachine += job.processingTime
                self.machines[machineCounter].addJob(job)

                if(singleMachine == t):
                    singleMachine = 0
                    machineCounter += 1
        return


def main():
    machines = 3
    M = []
    for i in range(3):
        M.append(Machine())
    A = []
    j0 = Job(0, 5)
    j1 = Job(1, 8)
    j2 = Job(2, 7)
    j3 = Job(3, 10)
    A.append(j0)
    A.append(j1)
    A.append(j2)
    A.append(j3)

    scheduler = Scheduler(A, M)
    scheduler.schedule()
    for i in range(machines):
        print("Machine " + str(i) + ": ", end="")
        for job in scheduler.machines[i].jobs:
            print("(" + str(job.index) + "," +
                  str(job.processingTime) + ") ", end="")
        print()


main()

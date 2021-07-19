# Secretary-Problem-Simulation
> The "secretary problem" for those that are unfamiliar is a problem of optimal stopping theory. Given a situation with N possible choices, and once evaluating a choice a yes/no decision must be made and cannot be reversed later, what is the optimal strategy for picking the best choice?

## Table of contents
* [General info](#general-info)
* [Results](#results)
* [Technologies](#technologies)
* [Status](#status)
* [Contact](#contact)

## General info
The Secretary problem involves selecting the best candidate for a position during a series of interviews in which the choice decision must be made immediately after each interview.
The guideline for interviewing the first n/e candidates to establish the standard against which the remaining candidates are judged is unfair to the first n/e candidates. One of them could be the best but is sacrificed to establish the standard. The problem is given as requiring a decision without waiting to see other candidates. In that sense, it is unrealistic. The other issue with the standard solution is that no candidate after the first n/e may be as good as the best of the first set. In that case the best candidate has their revenge for being sacrificed or they may be hired anyway--violating the given of the problem.

## Approach
The basic simulation strategy for this problem is fairly straightforward:

1. Create an array of integers of length N (ideally each number should be unique, though it's not an absolute requirement).
2. Shuffle these integers (a Fischer-Yates-Durstenfeld shuffle can be performed linearly).
3. Start with the first index and apply whatever ruleset you wish to select a candidate. I would make the decision-making algorithm a function of a class that accepts the total number of candidates and the ordinal and value of the current candidate. It can remember any combination or function of these values it likes.
4. Now scan the entire array to calculate the mean, median and maximum values in the array.
5. Compare your selected value with these stats; how far above average did you get? How close to the best did you get?

This is one test; you can repeat it as many times as you like to get an average performance metric for your ruleset. Now, plug in a different ruleset (this will be easiest if you encapsulate the decision-maker behind an interface of some kind) and run more tests. If you want you can multithread the tester to have multiple tests running concurrently (ideally a couple more than the number of processor cores available). Using this basic pattern, you can try any ruleset you like.

If you want to get even fancier, you can try your hand at a neuroevolutionary algorithm. The function will be the front door for a node-based computation system, and the simulation environment will be the fitness test. You'll then implement an evolutionary algorithm that will produce neural nets based on random "mutations" and/or "matings" of existing nets, and evaluate them with the fitness test to determine which do the job best. Then, once the evolution has plateaued after a few hundred generations, you can digest the algorithm, figure out how it does what it does and translate it back into static code.
## Results
After tunning the code for 100 different commit point I came up 37% chance of finding the best candidate. We know that we should always commit after seeng 37% of candidates. Why 37% is the magical stopping point? Well, because 1/e equals 0.367879. I (refer you to Wikipedia here)[https://en.wikipedia.org/wiki/Secretary_problem].
This chance strategy will get you the best choice converges to 1/e (37%) as the number of choices gets larger. While it doesn't guarantee you the best choice, it should give you a reasonably good choice a high percentage of the time given the constraints.

![Secretary Problem](https://github.com/danipedro2006/Secretary-Problem-Simulation/blob/main/TVeHr9ZTmO.png)

## Technologies
* Java - version 1.8

## Status
Project is under development. 

## Contact
Created by @Danisoft Arad 2021 (https://danipedro2006.github.io/) - feel free to contact me!
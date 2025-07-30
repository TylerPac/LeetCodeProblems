# Java Notes

# Psydeucode
    Problem Logic
        assuming 1 solution x + y = target

    loop through store each number in own map
        Find WantedValue key (target - value)
            check if map containes key
                if 
                    print SumValues
                add value to map
                

# Big O time Complexity        
O(n)
    Why
        Loops once through array and stops before end if found
            hash map lookup and insertion is O(1)
            Loop is O(n)
                so O(n) * O(1) = O(n) time complexity

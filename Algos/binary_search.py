data = [-3,-2,-1,0,1,1,  2,  3,5,8,13,21,34]
data2 = [-3,-2,-1,0,1,1,  2,3,  5,8,13,21,34,55]

def binary_search(data, target):
    """Iterative implementation of binary search algorithm.

    Args:
        data (list): sorted array/list of elements
        target (int): target element to search for
    """
    # the start and end indices of the array to search for
    start = 0
    end = len(data) - 1
    
    while end >= start:
        # find the median element's index in list using floor division
        mid = (start + end) // 2
        
        if data[mid] == target:
            return True
        elif data[mid] > target:
            # new endpoint is the endpoint of the array's lower half
            end = mid - 1
        else:
            # new startpoint is the startpoint of the array's upper half
            start = mid + 1        
    return False

print(binary_search(data, 3))
print(binary_search(data, 12))
print(binary_search(data2, 3))
print(binary_search(data2, 12))
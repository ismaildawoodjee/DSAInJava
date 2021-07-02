
data = [10, 5, 2, 0, 9, 6, 8, 1, 14, 3, 4, 7]
target = 11

# linear search
def linear_search(data, target):
    """Linear search algorithm to look for `target` in `data`.

    Args:
        data (list): linear data structure
        target (int): target element to search for
    """
    
    for i in range(len(data)):
        if data[i] == target:
            print(f"Found {target} at index {i}")
            return True
    print(f"Item {target} not found")
    return False
    
linear_search(data=data, target=target)


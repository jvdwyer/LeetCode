def to_lower_case(str: str) -> str:
    return str.lower()

def to_lower_case_hard_way(str: str):
    lower_case_list = []*len(str)
    for c in str:
        lower_case_list.append(c.lower())
    return ''.join(lower_case_list)
    

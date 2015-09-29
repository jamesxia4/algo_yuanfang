def main():
    a1=1
    a2=1
    array=[]
    array.append(a1)
    array.append(a2)
    for i in range(100):
        a3=array[len(array)-2]+array[len(array)-1]
        array.append(a3)

    for i in range(len(array)):
        print array[i],","
        
    

def average(arr):
	avg = 0
	sum = 0
	for x in range(0,len(arr),1):
		sum = sum + arr[x]
		
	avg = sum/len(arr)
	return avg
	

#include <stdio.h>

int main()
{
	printf("%d\n", cycle(33));
	system("pause");
	return 0;
}

int cycle(int n) {
	if (gcd(n) != 1)
		return -1;
	// Find the (n+1)th remainder after decimal point 
	// in value of 1/n 
	int rem = 1; // Initialize remainder 
	for (int i = 1; i <= n+1; i++)
		rem = (10*rem) % n;
	// Store (n+1)th remainder
	int d = rem;
	printf("remainder %d\n", rem);
	// Count the number of remainders before next 
	// occurrence of (n+1)'th remainder 'd' 
	int cy = 0;
	do {
		rem = (10*rem) % n;
		cy++;
	} while(rem != d);
	return cy;
}

int gcd(int n) {
	int ten = 10;
	while(ten != n) {
		if (ten > n)
			ten -= n;
		else
			n -= ten;
	}
	return ten;
}
/*
	dotest(33, 2);
	dotest(18118, -1);
	dotest(69, 22);
	dotest(197, 98);
	dotest(65, -1);
*/
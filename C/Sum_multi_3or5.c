#include <stdio.h>

int main()
{
	printf("%d\n", findSum(100));
	system("pause");
	return 0;
}

int findSum (int n) {
	int sum = 0;
	for (int i = 1; i <= n; i++)
		sum += !(i % 3) || !(i % 5) ? i : 0;
	return sum;
}
/*
	findSum (5), 8;
	findSum (10), 33;
	findSum (100), 2418;
	findSum (1000),  234168;
*/
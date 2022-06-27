var getMilitaryTime = function(input) {
	var arr = input.split(/\D/, 3);
	if (arr[0] == 12) {
		arr[0] = (/AM/.test(input)) ? "00" : "12" ;
	} else {
		if (/PM/.test(input)) {
			arr[0] = parseInt(arr[0]) + 12;
		}
	}
	return arr.join(":");
};
console.log(getMilitaryTime('12:00:01AM'));
console.log(getMilitaryTime('11:46:47PM'));
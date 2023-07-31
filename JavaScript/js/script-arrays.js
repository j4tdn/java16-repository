Array.prototype.add = function(index, element) {
	this.splice(index, 0, element);
};

//prototype có các hàm có sẵn của kiểu dữ liệu
//lấy kiểu dữ liệu chấm nó và định nghĩa các hàm thêm vào

let months = ['MAR','APR','MAY','JUN'];

//add
months.unshift('FEB'); //unshift(item) = add(0, item)
// expected ---> ['FEB','MAR','APR','MAY','JUN'];

//push
months.push('AUG');//push(item) = add(length-1, item);
// expected ---> ['FEB','MAR','APR','MAY','JUN','AUG'];

//month.slice(5,0,'JULY');//splice(index, deteteCount,items)
months.add(5,'JULY');
//deteteCount = 0 ==> add
//deteteCount > 0 ==> remove
//splice(index, 0, items) = addAll(index, items);

//remove

//reolace

console.log(months);

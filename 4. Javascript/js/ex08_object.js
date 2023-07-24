

// declare and init value for object

let person = {
	name: 'Join',
	age: '20',
	job: 'Software Engineer',

	toString: function(){
		console.log(`${this.name} + is ${this.age} years old`);
	},

	getJobSkills: function(){
		return 'BackEnd, FrontEnd, DataBase';
	}


};

person.toString();

let jobSkills = person.getJobSkills();

console.log('jobSkills ---> '+ jobSkills);

person.address = 'DaNang';

console.log("address --> " + person.address);

// 

let Person = function(name, age, job){
    this.name = name;
    this.age  = age;
    this.job = job;

    this.	toString = function(){
		console.log(`${this.name} is ${this.age} years old and job is ${this.job}`);
	}
}

let p1 = new Person('A', 18, 'Tester');
let p2 = new Person('B', 20, 'Dev');
p1.toString();
p2.toString();


class Employee{
	constructor(id, name, salary){
		this.id  = id;
		this.name = name;
		this.salary = salary;
	}

	showInfo()
	{
		console.log(`${this.id} - ${this.name} - ${this.salary}`);
	}
}

let e1 = new Employee(1, 'Duc', 2300);
e1.showInfo();
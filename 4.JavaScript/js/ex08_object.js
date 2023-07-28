console.log('======= Ex08 - JS Object =======');

// declare and init value for object
let person = {
	name: 'Join',
	age: '20',
	job: 'Software Engineer',

	toString: function() {
		console.log(`${this.name} is ${this.age} years old`);
	},

	getJobSkills: function() {
		return 'BackEnd, FrontEnd, Database';
	}
};

person.toString();
let jobSkills = person.getJobSkills();
console.log('jobSkills --> ' + jobSkills)

person.address = 'Da Nang';
console.log('person address --> ' + person.address);

// init object via function return object
// es5
let Person = function(name, age, job) {
	this.name = name;
	this.age = age;
	this.job = job;

	// nested function
	this.toString = function() {
		console.log(`${this.name} is ${this.age} years old`);
	}
}
let p1 = new Person('A', 77, 'Tester');
let p2 = new Person('B', 88, 'Dev');

p1.toString();
p2.toString();

// es6
class Employee {
	constructor(id, name, salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	showInfo() {
		console.log(`${this.id} - ${this.name} - ${this.salary}`);
	}
}

let e1 = new Employee(1, 'E1', 100);
e1.showInfo();

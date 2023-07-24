
let addButton = document.querySelector('.btn-add');
let textInput = document.querySelector('.new-task-conent');
let errorTag = document.querySelector('.error-message');
let tasks = document.querySelector('.tasks');

addButton.onclick = function() {
	let text = textInput.value.trim();
	if (text) {
		tasks.appendChild(createNewTask(text));
		textInput.value = '';
	} else {
		errorTag.classList.remove('invisible');
	}
}

textInput.onkeyup = function() {
	let text = textInput.value.trim();
	if (text) {
		errorTag.classList.add('invisible');
	} else {
		errorTag.classList.remove('invisible');
	}
}

function createNewTask(newTaskContent) {
	let newTask = document.createElement('li');

	// checkbox
	let div = document.createElement('div');
	div.setAttribute('class', 'cbx-done');

	let input = document.createElement('input');
	input.setAttribute('type', 'checkbox');
	div.appendChild(input);

	// content
	let p = document.createElement('p');
	p.setAttribute('class', 'content');
	p.textContent = newTaskContent;

	// remove
	let button = document.createElement('button');
	button.setAttribute('class', 'btn-remove');
	button.textContent = 'x';
	
	newTask.appendChild(div);
	newTask.appendChild(p);
	newTask.appendChild(button);

	return newTask;
}



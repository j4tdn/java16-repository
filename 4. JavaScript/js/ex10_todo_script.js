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

textInput.onkeyup = function(e) {
	let text = textInput.value.trim();
	if (text) {
		errorTag.classList.add('invisible');
	} else {
		errorTag.classList.remove('invisible');
	}

	// catch for pressing enter event
	if (e.which === 13) {
		addButton.click();
	}
}

document.querySelector('.tasks').onclick = function(e) {
	let component = e.target;
	
	if (component.classList.contains('btn-remove')) {
		let parent = component.parentElement;
		let taskName = component.previousElementSibling.textContent;
		let confirmed = confirm('Are You sure to delete the task "' + taskName + '"');
		if (confirmed) {
			parent.remove();
		}
	}

	if (component.classList.contains('chx-child')) {
		 let taskContent = component.parentElement.nextElementSibling;
		 toggleClass(taskContent, 'task-done');
	}
}


function createNewTask(newTaskContent) {
	let newTask = document.createElement('li');

	// checkbox
	let div = document.createElement('div');
	div.setAttribute('class', 'cbx-done');

	let input = document.createElement('input');
	input.setAttribute('type', 'checkbox');
	input.setAttribute('class', 'cbx-child');
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

function toggleClass(tag, cssClass) {
	if (tag.classList.contains(cssClass)) {
		tag.classList.remove(cssClass);
	} else {
		tag.classList.add(cssClass);
	}
}


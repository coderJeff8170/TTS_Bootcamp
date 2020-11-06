
/*

Get the following values:

Name of the course ('JavaScript Applications')[X]

Name of the second teacher ('Shane')[X]

Name of the first student ('Steve')[X]

Katy's computer type ('macbook')[X]

The preReq equipment object[X]

The second OSOption from equipment prereqs ('osx')

String listing the OSOptions separated by 'or' ('linux or osx')

An array of all the students that are using osx
*/

let course = {
	name: 'JavaScript Applications',
	awesome: true,
	teachers: ['Assaf', 'Shane'],
	students: [
		{
			name: 'Steve',
			computer: {
				OS: 'Linux',
				type: 'laptop'
			}
		},
		{
			name: 'Katy',
			computer: {
				OS: 'OSX',
				type: 'macbook'
			}
		},
		{
			name: 'Chuck',
			computer: {
				OS: 'OSX',
				type: 'macbook'
			}
		}

	],
	preReqs : {
		skills : ['html', 'css', 'git'],
		equipment: {
			laptop: true,
			OSOptions: ['linux', 'osx']
		}
	}
};

console.log(course.name); //Javascript Applications
console.log(course.teachers[1]); //Shane
console.log(course.students[0].name); //Steve
console.log(course.students[1].computer.type); //macbook
console.log(course.preReqs);
console.log(course.preReqs.equipment);// { laptop: true, OSOptions: [ 'linux', 'osx' ] }
console.log(course.preReqs.equipment.OSOptions[1]);//osx
console.log(`${course.preReqs.equipment.OSOptions[0]} or ${course.preReqs.equipment.OSOptions[1]}`);

let osxStudents = [];
for(let i=0; i<course.students.length; i++){
	if(course.students[i].computer.OS==='OSX'){
		osxStudents.push(course.students[i]);
	}
}

console.log(osxStudents);//[{ name: 'Katy', computer: { OS: 'OSX', type: 'macbook' } }, { name: 'Chuck', computer: { OS: 'OSX', type: 'macbook' } } ]
/*
Find a player with the name 'Mike'[X]
Get an array of all players with position 'RB'[X]
Get an array of all the players lastNames [X]
Get an array of the full names of all the running backs with more than 5 touchdowns[X]
Get the number of touchdowns scored by Running backs [X]
    */



let players = [
	{firstName: 'Cam', lastName: 'Newton', position: 'QB', touchdowns: 32},
	{firstName: 'Derek', lastName: 'Anderson', position: 'QB', touchdowns: 0},
	{firstName: 'Jonathan', lastName: 'Stewart', position: 'RB', touchdowns: 12},
	{firstName: 'Mike', lastName: 'Tolbert', position: 'RB', touchdowns: 8},
	{firstName: 'Fozzy', lastName: 'Whittaker', position: 'RB', touchdowns: 3},
	{firstName: 'Ted', lastName: 'Ginn', position: 'WR', touchdowns: 9},
	{firstName: 'Devin', lastName: 'Funchess', position: 'WR', touchdowns: 2},
	{firstName: 'Mike', lastName: 'Funchess', position: 'WR', touchdowns: 2}
];
//find only returns the first match
function findPlayer(players, name){
	return players.find(player => player.firstName===name);
}

// function filterPlayers(players, stat, value){
// 	//gotta use brackets!
// 	return players.filter(player => player[stat]===value);
// }

//will return all players certain stat, or
//if a third parameter 'value' is included, will return all players whose stat meets that value
function filterPlayers(players, stat, value){
	//gotta use brackets!
	if(value){
		//where stat is a certain value
		return players.filter(player => player[stat]===value);
	}else{
		//where need stat from each player
		return players.map(player => player[stat]);
	}
}

let manyTDs = players.filter(player => (player.position==='RB'&&player.touchdowns>5)).map(player=>`${player.firstName} ${player.lastName}`);
let howManyTDs = players.filter(player => (player.position==='RB')).reduce((total, player) => total+=player.touchdowns, 0);
// console.log(findPlayer(players, 'Mike')); //works
// console.log(filterPlayers(players, "position", "RB")); //works
// console.log(filterPlayers(players, 'lastName'));
// console.log(filterPlayers(players, 'firstName', 'Mike'));//works for first challenge too, but returns all!
// console.log(manyTDs);
console.log(howManyTDs);
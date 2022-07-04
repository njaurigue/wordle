let row = 1;
let char = 0;
let words = [];
const fs = require("fs");
fs.readFile("words.csv", "utf-8", (err, data) =>{
    if(err){
        console.error(err);
        return;
    }
    words = data.split(" ");
})
console.log(words[0]);

document.addEventListener("keydown", e => {
    console.log(e)
    if(char != 5){
        if(e.key.length == 1){
            document.getElementById(row + "," + char).innerHTML = e.key;
            char++;
        }
    }else{
        if(e.key == "Enter"){
            row++;
            char = 0;
        }
    }
});

function newGame(){
    for(let i = 1; i < 7; i++){
        for(let j = 0; j < 5; j++){
            document.getElementById(row + "," + char).innerHTML = "0";
        }
    }
    row = 1;
    char = 0;
    solution = 0;
}

function getSolution(){
    return words[Math.floor(Math.random() * 12947)];
}
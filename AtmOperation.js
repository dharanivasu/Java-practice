

var amount=1000;
function deposit(){
    var num=parseInt(prompt("enter the amount"));
num=amount+num;
document.write("deposit successfully");

}
function withdraw(){
    var num2=prompt("enter the widthdraw amount");
    num=amount+num2;
    document.write(amount);
    document.write("widthdraw successfully");
    
    }
    function displayAmount(){
       
        document.write("your balance is"+amount);
        
        }
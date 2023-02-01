function employee(){
//var emp= {
  //  id:1,
  //  name:"dhara",
 //   salary:50000,
 //   dept:"developer",
 //   phoneNumber:[8345690743,34553323]
//}
// document.write(emp.id+" "+emp.name+" "+emp.salary,emp.dept,emp.phoneNumber);



//var emp=new Onject();
//emp.id=1;
//emp.name="dhara";
//emp.salary=50000;
//emp.phoneNumber=[2345674564,567834556];
//document.write(emp.id,emp.name,emp.salary,emp.phoneNumber);



function emp(id,name,salary,phoneNumber){
    this.id=id;
    this.name=name;
    this.salary=salary;
    this.phoneNumber=phoneNumber;

}

emp1=new emp(1,"dhara",10000,[233435454,45565657]);
document.write(emp1.id+emp1.name+emp1.salary+emp1.phoneNumber);


}

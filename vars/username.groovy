def call(username){
  if (${username} != admin){
    println "This is not admin user and username is $username"
  }
  else{
    println "This is admin user"
  }
     
}

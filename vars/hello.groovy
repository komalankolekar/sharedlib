
def call(username){
  echo "Hi ${username}"
   if ("${username}" != "[admin]"){
    echo "This is not admin user and username is $username"
     currentBuild.result = 'FAILURE'
     error "${username} Can not execute if branch is other than Dev!"
  return
    

  }
  else{
    echo "This is admin user"
  }  
}

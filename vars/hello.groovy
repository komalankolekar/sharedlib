
def call(username){
  echo "Hi ${username}"
   if ("${username}" != "[admin]"){
    echo "This is not admin user and username is $username"
     t = currentBuild.number
    echo "${t}"
  currentBuild.result = 'FAILURE'
     error "This pipeline stops here!"
  // sh 'exit 1'
  return
    
     //echo "after fail"
  }
  else{
    echo "This is admin user"
  }  
}

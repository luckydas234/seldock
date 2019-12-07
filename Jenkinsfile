node{
stage('SCM Checkout')
{
  
 git 'https://github.com/luckydas234/seldock.git'
}
stage('Compile-package')
{
 //get maven home
 def mvnHome= tool name: 'globalmaven', type: 'maven'
  sh "${mvnHome}/bin/mvn package"
}

}

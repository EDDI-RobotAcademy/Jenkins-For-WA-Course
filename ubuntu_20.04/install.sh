!/usr/bin/bash

sudo apt-get update
sudo apt-get install openjdk-17-jdk -y
wget -q -O - https://pkg.jenkins.io/debian-stable/jenkins.io.key | sudo apt-key add -
sudo sh -c 'echo deb http://pkg.jenkins.io/debian-stable binary/ > /etc/apt/sources.list.d/jenkins.list'
sudo apt-get update
sudo apt-get install jenkins -y
sudo systemctl start jenkins
sudo ufw disable
sudo cat /var/lib/jenkins/secrets/initialAdminPassword

echo '브라우저를 열고 localhost:8080을 입력한 다음 admin에 출력된 비밀번호를 입력'

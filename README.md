zhengze
=======

git 使用：
1. git init :初始化一个代码仓库
2. git add filename :向本地代码仓库添加文件
3. git commit -m "注释"向本地代码仓库提交文件
4. git remote add 别名 url :为远程代码库添加别名
5. git push 别名 branch :将文件添加到代码库的某个分支
6. 如果远程代码库里的内容和本地代码库的内容不一致将会报错（Updates were rejected because the remote contains work that you do not have locally.）此时需要先pull(git pull 别名 branch)然后再push

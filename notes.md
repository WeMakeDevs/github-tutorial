# Git and Github:

Initialize git repository in any folder to track the folder's changes
cd to that folder and
`git init`

check status of the files staged
`git status`

to add new changes to the git repo
`git add . `
( . represents current directory)(or git add file_name)

restore the staged file (remove particular files from staging)
`git restore --staged file_name`

check history of commits made
`git log`

restore to a previous commit
`git reset commit_id`
(commit id you get by git log, there will be hash value after commit word)
(these changes will be then restored and are kept in unstagged area, you can see them by git status)

add new changes to stash area (backstage)
`git stash`
to bring the changes from the stash back
`git stash pop`
clear the changes that are saved on stash
`git stash clear`

---

## Creating New Github Repo:

add your project to the repo
`git remote add origin repo_url`
(origin is a name that we give to the url by convention, you can choose any other name if you like)
(repo_url ex: https://github.com/jaypnchl/devopsbootcamp-git.git)

push the project to github
`git push origin master`
or
`git push origin main` (newer version of git clients use main)

clone projects from github
`git clone repo_url`

---

## Git Branches:

create new branch
`git branch branch_name`

move head to the new branch
`git checkout branch_name`

add upstream url to make pull request (url from where the project was forked)
`git remote add upstream https://github.com/commclassroom/commclassroomOP.git`

## Git and Github:

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

### Creating New Github Repo:

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

### Git Branches:

create new branch  
`git branch branch_name`

move head to the new branch  
`git checkout branch_name`

add upstream url to make pull request (url from where the project was forked)  
`git remote add upstream https://github.com/commclassroom/commclassroomOP.git`

force push commit  
`git push origin master -f`

maintain your forks main branch to the original main branch of project  
`git checkout main` (checkout to main branch)  
`git fetch --all --prune`  
`git reset --hard upstream/main`  
or  
`git pull upstream main` (with this you can fetch upstreams main branch with single command)

---

### Squash Commits:

to squash multiple commits in a single one  
you can either reset the head to a commit previous to the commits that you want to merge  
or use rebase command as follows:  
`git rebase -i commit_id`  
(here the commit_id is the one above which the other commits needs to be merged or squashed)

this will open vim  
the commits will be shown as

```
pick commit1 commit_msg
pick commit2 commit_msg
pick commit3 commit_msg
pick commit4 commit_msg
```

the commits that you want to merge, edit the pick to 'squash' or 's'  
say we want to merge commits 1, 2, 3

```
pick commit1 commit_msg
s commit2 commit_msg
s commit3 commit_msg
pick commit4 commit_msg
```

the commits 2 and 3 will be merged with 1  
resulting them to be a single commit

save the file

this will then open up a new vim asking to type commit message  
write your message for the merged commits and exit vim with ':x'

check git log you'll find your commits merged

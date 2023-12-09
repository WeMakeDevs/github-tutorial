# WeMakeDevs is OP

- Kunal Kushwaha says that this community is amazing.
- Kunal made this change
- I love MLH
- More power to kunal. love the work which your are doing for the community.
- Anirudh Sharma finds the Community Classroom initiative really great!
- [abhijitgawai](https://github.com/abhijitgawai) finds the Community Classroom awesome !!


<br>

# Git Cheat Sheet

<br>

## Configure

`git config --global --edit` - Set Up your Email and Username

<br>


## Git Basic Commands

`git init` - Current directory becomes git repository


`git clone [url]` - Downloads repository from Github url (includes all files, branches, commits)


`git status` - Lists all files (staged, unstaged, untracked)


`git add [file]` - Adds file to staging area for next commit


`git add .` - Adds all files in current directory to staging area for next commit


`git commit -m "<message>"` - commits staged files

`git log` - Displays git history

`git diff` - Shows changes between working directory and staging area

<br>

## Redo commits

`git reset [commit]` - Undoes all commits after [commit], preserving changes locally

`git reset --hard [commit]` - Discards all history and changes back to the specified commit

<br>

## Synchronize Changes

`git fetch` - Downloads all history from the remote tracking branches

<br>

## Remote Repositories

`git remote add <name> [url]` - Create new head to remote repository. 

`git remote -v` - Lists all heads to remote repositories

`git fetch <remote> <branch>` - Fetchs changes from the remote, but tracking branches are not updated

`git merge <branch>- Merge <branch> into current branch

`git pull <remote>` -  Fetchs remote copy of current branch and merge it into local copy (git pull is combination of `git fetch` and `git merge`)

`git push <remote> <branch>` - Push local branch to <remote> repository (creates <branch> if it doesn't exists)
  
  <br>

## Branches

`git branch` - Lists all branches in Repository

`git branch [branch_name]` - Creates a new branch by name branch_name

`git checkout [branch_name]` - Switches to the specified branch and updates the working directory

`git checkout -b [branch_name]` - Creates new branch by name branch_name and switches to branch_name

`git merge [branch_name]` - Merge [branch_name] in current branch (This is how we creates pull request)

`git branch -d [branch_name]` - Deletes branch [branch_name]



# [The Freedom Wrapper Project Contribution Guidlines](https://github.com/mdbench/The-Freedom-Wrapper-Project/blob/master/README.md)
[![GitHub license](https://img.shields.io/github/license/mdbench/The-Freedom-Wrapper-Project?style=for-the-badge)](https://github.com/mdbench/The-Freedom-Wrapper-Project/blob/master/LICENSE) [![GitHub forks](https://img.shields.io/github/forks/mdbench/The-Freedom-Wrapper-Project?style=for-the-badge)](https://github.com/mdbench/The-Freedom-Wrapper-Project/network) [![GitHub stars](https://img.shields.io/github/stars/mdbench/The-Freedom-Wrapper-Project?style=for-the-badge)](https://github.com/mdbench/The-Freedom-Wrapper-Project/stargazers)

![TFWPBanner](https://raw.githubusercontent.com/mdbench/The-Freedom-Wrapper-Project/master/TFWPLogo.png)

## Table of Contents
1. Standardized coding conventions create strong coding communities
2. Get general help or support from our blossoming TFWP community

### Building a strong contribution community:
- Thank you for reading these contribution guidelines. It is important to take the time to get acquainted with the guidelines for each repository you visit. This is extremely important if you intend on making a contribution.

	1. All contributions/pull requests/issues need to have a clear message attached to them. At the bare minimum, you should answer the following questions:
		- What are you contributing?
		- What does it add or subtract to the original TFWP source code?
		- Why do you think this contribution is important?
		- Does this contribution solve a current problem or does it project to solve problem that, while it does exist in other platforms, does not exist within this current project?
		
	2. All git commits should follow a format based on their intended use.
		- For contributions: `git commit -m "added ____, for [insert description] contribution."`
		- For issues:  `git commit -m "modified ____, for [insert description] issue."`
			- *Note: for all commits to TFWP repository, please make sure to add a paragraph that describes changes and your intended impact.*
			
	3. Coding conventions
		- How you place your code does not strictly matter. TFWP is not a stickler for strict indenting or spacing practices - and we tend to remove ourselves from philosophical debates on this type of organization. With that in mind, we do have some coding conventions because this is an open source code repository and people need to be able to use your code or follow your coding methodology, as we are all different. 
		
		- At minimum, you need to ensure your code has:
			- Comments that show where resources link. For example, in Android Studio you need to make sure that a *button* in a `.java` resource has a code comment that shows the xml resource file it links to, as many people that use TFWP are beginners and sometimes more explanation is needed to ensure they understand the process. 
			
			- Furthermore, all java and xml resources need to be labelled reasonably enough that someone could trace your code without undue burden. If a `.java` resource is the main portion of your application upon opening, it makes sense to call it `.Main` or `.MainActivity`. It does not make sense to call it `.MyApp`, as every resource file is a part of your app. In essence, your contributions need to be able to delineate between the hierarchical structure, order, or method behind your coding process (or madness if you prefer).
			
			- If you make a java class that you intend to implement in your app globally, call it something that makes sense and add the word `global` to it. For instance, if you make a swipe java class for moving forwards and backwards between a view, you could call it `SwipeBackwardsForwardsGlobal.java`. This will make it easier to understand. Your `.java` resource file, for this project, is meant to do specific things only within that `.java`. Do not, I repeat, do not make a global java class in a `.java` resource file that is, for instance, your main java resource file and then call that class for other `.java` resources. While you can do this, beginners have a hard time unraveling the rat's nest you have created. Structures and organization should, I repeat, be heirarchical, structured, and ordered. While this is a value judgement, its usually obvious when something does or does not meet these criteria.

##### Please ensure you check these contribution guidelines every now and then, as they are a living document that will change based on lessons learned from contributions over time. After all, beginners learn in a specific way and, based on this projects philosophy, only beginners will be able to tell us the easiest methodology for organized coding practices.


### Contact TFWP's Community of Developers (CoD)

- [Visit the TFWP Keybase Channel](https://keybase.io/team/tfwp)


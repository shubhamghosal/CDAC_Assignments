package dao;

import java.time.LocalDate;
import java.util.List;

import pojos.Role;
import pojos.User;

public interface IUserDao {
	String saveUserDetails(User user);// user : exists ONLY in heap : TRANSIENT(not yet persistent)

	String saveUserDetailsWithCurntSession(User user);// user : exists ONLY in heap : TRANSIENT(not yet persistent)
	// get user details by PK

	User getUserDetails(int userId);

	// get all users
	List<User> getAllUsers();

	// get selected users by date n role
	List<User> getSelectedUsers(LocalDate begin, LocalDate end, Role userRole);

	// get selected users' names by date n role
	List<String> getSelectedUserNames(LocalDate begin, LocalDate end, Role userRole);
	
	// get selected users' details  by date n role : constr expression
		List<User> getSelectedUserDetails(LocalDate begin, LocalDate end, Role userRole);
}

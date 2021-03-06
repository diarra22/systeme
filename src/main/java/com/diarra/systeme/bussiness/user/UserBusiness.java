package com.diarra.systeme.bussiness.user;

import com.diarra.systeme.bean.User;
import com.diarra.systeme.dto.AuthResponse;
import com.diarra.systeme.dto.RegisterRequest;


public interface UserBusiness {

	/*
	 * Enregistrement d'un utlisateur
	 * @param user l'utilisateur a enregistrer
	 * @return enregistre un utilisateur dans la base de donnée
	 */
	User save(User user);

	/*
	 * Recherche d'un utilisateur
	 * @param username (pseudo) de l'utilisateur a rechercher
	 * @return l'utilisateur s'il existe
	 */
	User getByUsername(String username);

	/*
	 * Authentification utilisateur
	 */
	AuthResponse authentication(String username, String password) throws Exception;

	/*
	 * Inscription d'un utilisateur
	 */
	User registration(User user);

	/*
	 * Modification info user password and name
	 */
	User update(User userToUpdate, RegisterRequest registerRequest);
	

}

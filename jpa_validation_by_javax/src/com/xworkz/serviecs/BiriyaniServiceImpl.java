package com.xworkz.serviecs;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.dao.BiriyaniDAO;
import com.xworkz.dao.BiriyaniDAOImpl;
import com.xworkz.entity.BiriyaniEntity;

public class BiriyaniServiceImpl implements BiriyaniService {

	BiriyaniDAO dao = new BiriyaniDAOImpl();
	ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

	@Override
	public boolean validateAndSave(BiriyaniEntity entity) {

		Validator validator = factory.getValidator();
		Set<ConstraintViolation<BiriyaniEntity>> violation = validator.validate(entity);
		if (violation.size() > 0)
			for (ConstraintViolation<BiriyaniEntity> violations : violation) {
				System.out.println(violations.getMessage());
				System.out.println("entity is not valid");
			}else {
			System.out.println("Validation is valid");
			return this.dao.save(entity);
		}
		return false;

	}

}

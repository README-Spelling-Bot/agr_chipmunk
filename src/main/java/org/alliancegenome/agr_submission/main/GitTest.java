package org.alliancegenome.agr_submission.main;

import org.alliancegenome.agr_submission.util.github.GitHelper;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class GitTest {

	public static void main(String[] args) {
		GitHelper helper = new GitHelper();
		
		helper.setupSchemaRelease("1.0.1.0");
		//log.debug(ConfigHelper.getValidationSoftwarePath());
	}

}
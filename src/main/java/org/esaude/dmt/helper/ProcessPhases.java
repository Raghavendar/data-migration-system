package org.esaude.dmt.helper;

/**
 * System representation of the process phases
 * @author Val�rio Jo�o
 * @since 29-08-2014
 *
 */
public interface ProcessPhases {
	
	/*
	 * Validates the matching logic and
	 * matching data
	 */
	public static final String VALIDATION = "VALID";
	/*
	 * Translates the matching objects into SQL INSERT and
	 * SELECT queries
	 */
	public static final String TRANSLATION = "TRANS";
	/*
	 * Executes the queries into the target databases
	 */
	public static final String EXECUTION = "EXEC";

}

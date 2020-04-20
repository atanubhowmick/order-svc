/**
 * 
 */
package com.atanu.spring.order.constant;

import com.atanu.spring.order.repository.QueryPageableSpecification;

/**
 * This enum contains all the operator to perform the Filter and Search operation.
 * 
 * @see QueryPageableSpecification
 * 
 * @author Atanu Bhowmick
 *
 */
public enum QueryOperatorEnum {
	IS_NULL,
	IS_NOT_NULL,
	EQUAL,
	NOT_EQUAL,
	GREATER_THAN_EQUAL,
	LESS_THAN_EQUAL,
	IN;
}

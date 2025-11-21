package main.helper;

/**
 * Class responsible to help the calculator core with values convertion and verifications
 * 
 * @author Lucas Alexandre Bez Piancoski
 * @since 20/11/2025
 */
public class CalcHelpers {

	/**
	 * Convert a String to a Integer
	 * 
	 * @throws NumberFormatException if value is not a valid number format, for example 'a'
	 * @param value the String to be converted
	 * @return a integer value
	 * 
	 * @author Lucas Alexandre Bez Piancoski
	 * @since 20/11/2025
	 */
	public Integer convertUserInpuToInt(String value) {
		try {			
			return Integer.valueOf(value);
		} catch (NumberFormatException e) {
			throw new NumberFormatException(value + " is not a valid value");
		}
	}
	
	/**
	 * Convert a String to a Float
	 * 
	 * @throws NumberFormatException if value is not a valid number format, for example 'a'
	 * @param value the String to be converted
	 * @return a float value
	 * 
	 * @author Lucas Alexandre Bez Piancoski
	 * @since 20/11/2025
	 */
	public Float convertUserInpuToFloat(String value) {
		try {
			return Float.valueOf(value); 			
		} catch (NumberFormatException e) {
			throw new NumberFormatException(value + " is not a valid value");
		}
	}
	
	/**
	 * Verify if a String has '.' and confirm that is a float type
	 * @param value the string value to be checked
	 * @return true if is float else return false
	 * 
	 * @author Lucas Alexandre Bez Piancoski
	 * @since 20/11/2025
	 */
	public boolean isFloat(String value) {
		if (value.contains(".")) return true;
		return false;
	}
}

/*
 * Encog(tm) Core v2.5 - Java Version
 * http://www.heatonresearch.com/encog/
 * http://code.google.com/p/encog-java/
 
 * Copyright 2008-2010 Heaton Research, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *   
 * For more information on Heaton Research copyrights, licenses 
 * and trademarks visit:
 * http://www.heatonresearch.com/copyright
 */

package org.encog.engine.network.rbf;

/**
 * Provides a generic interface to a radial basis function (RBF). Encog uses
 * RBF's for a variety of purposes.
 * 
 * @author jheaton
 * 
 */
public interface RadialBasisFunction {

	/**
	 * Calculate the RBF result for the specified value.
	 * 
	 * @param x
	 *            The value to be passed into the RBF.
	 * @return The RBF value.
	 */
	double calculate(double x);

	/**
	 * Calculate the derivative of the RBF function.
	 * 
	 * @param x
	 *            The value to calculate for.
	 * @return The calculated value.
	 */
	double calculateDerivative(double x);

	/**
	 * @return The center of the RBF.
	 */
	double getCenter();

	/**
	 * @return The peak of the RBF.
	 */
	double getPeak();

	/**
	 * @return The width of the RBF.
	 */
	double getWidth();

	/**
	 * Set the width.
	 * @param radius The width.
	 */
	void setWidth(double radius);
}
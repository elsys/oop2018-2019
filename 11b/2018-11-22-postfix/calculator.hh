#ifndef CALCULATOR_HH_
#define CALCULATOR_HH_

#include <vector>
#include <iostream>

class Calculator {
	std::vector<double> values_;
	
	void push(double value);
	double pop();
public:
	void run(std::istream& in, std::ostream& out);
};

#endif

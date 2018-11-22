#include "calculator.hh"
#include <iostream>
#include <sstream>
#include <exception>

using namespace std;

void Calculator::push(double value) {
	values_.push_back(value);
}

double Calculator::pop() {
	double result = values_.back();
	values_.pop_back();
	return result;
}

void Calculator::run(istream& in, ostream& out) {
	while (!in.eof()) {
		out << "(" << values_.size() << "): ";
		string token;
		getline(in, token);
		istringstream iss(token);
		double value;
		iss >> value;
		if (!iss.fail() && iss.eof()) {
			push(value);
		} else {
			double result;
			if (token == "abs") {
				result = pop();
				result = result < 0 ? -result : result;
				push(result);
			} else {
				throw exception();
			}
			out << result << endl;
		}
		
	}
}

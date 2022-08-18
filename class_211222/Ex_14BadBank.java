package class_211222;
class Ex_14BadBank extends Ex_14Bank{
	@Override
	double getInterestRate() {
		return 10.0;
	}
}

class Ex_14NormalBank extends Ex_14Bank{
	@Override
	double getInterestRate() {
		return 5.0;
	}
}

class Ex_14GoodBank extends Ex_14Bank{
	@Override
	double getInterestRate() {
		return 3.0;
	}
}

package by.academy.tasks.InterfaceEnum.Task3;

public enum Seasons {
	WINTER(-10.5), SPRING(15.6), SUMMER(26.7) {
		public String getDescription() {
			return "It's warm season";
		}
	},
	FALL(12.6);

	public double average;

	private Seasons(double average) {
		this.average = average;
	}

	public String getDescription() {
		return "It's cold season";
	}

}

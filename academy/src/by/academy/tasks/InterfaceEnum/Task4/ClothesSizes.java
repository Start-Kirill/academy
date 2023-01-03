package by.academy.tasks.InterfaceEnum.Task4;

public enum ClothesSizes {
	XXS(32) {
		public String getDescription() {
			return "Child size";
		}

	},
	XS(34), S(36), M(36), L(40);

	private int euroSize;

	private ClothesSizes(int euroSize) {
		this.euroSize = euroSize;
	}

	public int getEuroSize() {
		return euroSize;
	}

	public String getDescription() {
		return "Adult size";
	}

}

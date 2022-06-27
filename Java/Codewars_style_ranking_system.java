public class Codewars_style_ranking_system{
	public static void main(String[] args) {
		System.out.println(incProgress(-7)); 
	}//deberia ser un archivo aparte llamado User
	public class User {
		int rank = -8;
		int progress = 0;

		public void incProgress(int acRank) {
			if (acRank < -8 || acRank > 8 || acRank == 0) throw new IllegalArgumentException();
			if (this.rank < 0 && acRank > 0) acRank--;
			if (this.rank > 0 && acRank < 0) acRank++;
			if (this.rank == acRank) this.progress += 3;
			if (this.rank - 1 == acRank) this.progress += 1;
			if (this.rank - 2 >= acRank) this.progress += 0;
			if (this.rank < acRank) {
				int d = acRank - this.rank;
				this.progress += (10 * d * d);
			}
			while (this.progress >= 100 && this.rank < 8) {
				if (++this.rank == 0) this.rank++;
				this.progress -= 100;
			}
			if (this.rank == 8) this.progress = 0;
		}
	}
}
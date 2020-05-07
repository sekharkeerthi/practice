package com.sk.designpatterns.builder;

public class Title {

	public static class TitleBuilder {

		private String currentTitle;
		private String episodes;
		private String tvdHierachy;

		public TitleBuilder() {

		}

		public Title build() {
			return new Title(this);
		}

		public TitleBuilder currentTitle(String currentTitle) {
			this.currentTitle = currentTitle;
			return this;
		}

		public TitleBuilder episodes(String episodes) {
			this.episodes = episodes;
			return this;
		}

		public TitleBuilder tvdHierachy(String tvdHierachy) {
			this.tvdHierachy = tvdHierachy;
			return this;
		}
	}

	private final String currentTitle;
	private final String episodes;
	private final String tvdHierachy;

	public Title(TitleBuilder builder) {
		this.currentTitle = builder.currentTitle;
		this.episodes = builder.episodes;
		this.tvdHierachy = builder.tvdHierachy;
	}

	public static TitleBuilder builder() {
		return new TitleBuilder();
	}

	public String getCurrentTitle() {
		return currentTitle;
	}

	public String getEpisodes() {
		return episodes;
	}

	public String getTvdHierachy() {
		return tvdHierachy;
	}

	@Override
	public String toString() {
		return "TitleBuilder(currentTitle = " + currentTitle + ", episodes = " + episodes + ", tvdHierachy = " + tvdHierachy;
	}

}

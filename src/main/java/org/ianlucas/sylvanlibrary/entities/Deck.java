package org.ianlucas.sylvanlibrary.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "deck")
//@SqlResultSetMapping(name = "findTop10ByFormatAndContentCard",
//		classes = {
//			@ConstructorResult(targetClass = ArchetypeDTO.class,
//					columns = {@ColumnResult(name = "name"), 
//							@ColumnResult(name = "playerName"), 
//							@ColumnResult(name = "format"),
//							@ColumnResult(name = "archetype")
//			})})
public class Deck {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer deckId;
	@Column(name = "name")
	private String deckName;
	@Column(name = "player")
	private String playerName;
	@Column(name = "format")
	private String format;
	@Column(name = "archetype")
	private String archetype;
	
	@OneToMany
	private List<Content> content;
	
//	@ManyToOne
//	private DeckArchetype archetypeDetail;
	
	public Deck() { }
	
	public Deck(String deckName, String archetype, String playerName, List<Content> content/*, DeckArchetype archetypeDetail*/) {
		this.deckName = deckName;
		this.archetype = archetype;
		this.playerName = playerName;
		this.content = content;
//		this.archetypeDetail = archetypeDetail;
	}

	public Integer getDeckId() {
		return deckId;
	}

	public void setDeckId(Integer deckId) {
		this.deckId = deckId;
	}

	public String getDeckName() {
		return deckName;
	}

	public void setDeckName(String deckName) {
		this.deckName = deckName;
	}

	public String getArchetype() {
		return archetype;
	}

	public void setArchetype(String archetype) {
		this.archetype = archetype;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

//	public DeckArchetype getArchetypeDetail() {
//		return archetypeDetail;
//	}
//
//	public void setArchetypeDetail(DeckArchetype archetypeDetail) {
//		this.archetypeDetail = archetypeDetail;
//	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	public List<Content> getContent() {
		return content;
	}

	public void setContent(List<Content> content) {
		this.content = content;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((archetype == null) ? 0 : archetype.hashCode());
//		result = prime * result + ((archetypeDetail == null) ? 0 : archetypeDetail.hashCode());
		result = prime * result + deckId;
		result = prime * result + ((deckName == null) ? 0 : deckName.hashCode());
		result = prime * result + ((format == null) ? 0 : format.hashCode());
		result = prime * result + ((playerName == null) ? 0 : playerName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deck other = (Deck) obj;
		if (archetype == null) {
			if (other.archetype != null)
				return false;
		} else if (!archetype.equals(other.archetype))
			return false;
//		if (archetypeDetail == null) {
//			if (other.archetypeDetail != null)
//				return false;
//		} else if (!archetypeDetail.equals(other.archetypeDetail))
//			return false;
		if (deckId != other.deckId)
			return false;
		if (deckName == null) {
			if (other.deckName != null)
				return false;
		} else if (!deckName.equals(other.deckName))
			return false;
		if (format == null) {
			if (other.format != null)
				return false;
		} else if (!format.equals(other.format))
			return false;
		if (playerName == null) {
			if (other.playerName != null)
				return false;
		} else if (!playerName.equals(other.playerName))
			return false;
		return true;
	}
}

defmodule RnaTranscription do
  @doc """
  Transcribes a character list representing DNA nucleotides to RNA

  ## Examples

  iex> RnaTranscription.to_rna('ACTG')
  'UGAC'
  """

  @nucleotides %{
    ?G => ?C,
    ?C => ?G,
    ?T => ?A,
    ?A => ?U,
  }

  @spec to_rna([char]) :: [char]
  def to_rna(strand) do
    Enum.map(strand, fn nuc -> @nucleotides[nuc] end)
  end
end

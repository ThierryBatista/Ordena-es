package controller;

import bubblesort.batista.BubbleSort;
import mergesort.batista.MergeSort;

public class OrdenacoesController 
{
 public OrdenacoesController()
 {
 super();	 
 }

 public int[] OrdenarB(int[] vet)
 {
  BubbleSort bubble = new BubbleSort();	 
  vet = bubble.Bubbles(vet);
  return vet;
 }
 
 public int[] OrdenarM(int[] vet)
 {
  MergeSort merge = new MergeSort();
  vet = merge.Merge(vet, 0, vet.length - 1);
  return vet;
 }
 
}
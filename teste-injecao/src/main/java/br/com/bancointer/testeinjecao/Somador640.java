package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador640")
public class Somador640 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}

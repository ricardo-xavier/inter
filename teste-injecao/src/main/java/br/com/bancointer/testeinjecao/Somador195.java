package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador195")
public class Somador195 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}

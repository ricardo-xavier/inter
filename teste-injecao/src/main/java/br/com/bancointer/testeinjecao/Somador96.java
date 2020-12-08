package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador96")
public class Somador96 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}

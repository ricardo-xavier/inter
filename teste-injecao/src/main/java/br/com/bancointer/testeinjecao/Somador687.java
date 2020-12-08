package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador687")
public class Somador687 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}

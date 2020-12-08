package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador851")
public class Somador851 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
